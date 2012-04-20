class TournmentGenerator

    def generate_for num_of_players

        number_of_rounds = calculate_rounds(num_of_players)
        tournament = []
        (0...number_of_rounds).each do |round|
            num_of_players_of_round = num_of_players / 2 ** round
            tournament << get_matches_of_round_for(num_of_players_of_round)

        end
        tournament
    end

    def calculate_rounds num_of_players
        Math.log2(num_of_players)
    end

    def number_of_games_for num_of_players
        2 ** (Math.log2(num_of_players).ceil - 1)
        #(num_of_players / 2.0).ceil
    end

    def get_matches_of_round_for(number_of_players)
        matches = []
        (1..number_of_games_for(number_of_players)).each do |game|
            best  = game
            worst = number_of_players - game + 1
            matches << "#{best}x#{worst}"
        end
        matches
    end
end