
require "test/unit"
require "lib/tournment_generator.rb"

class TestDojo < Test::Unit::TestCase

    def setup
        @tournment_generator = TournmentGenerator.new
    end

    def test_generate_two_players_match

        result = @tournment_generator.generate_for(2)

        assert_equal(1, result.size)
        assert_equal("1x2", result[0][0])


    end

    def test_generate_four_players_match
        result = @tournment_generator.generate_for(4)

        assert_equal(2, result.size)
        assert_equal("1x4", result[0][0])
        assert_equal("2x3", result[0][1])
        assert_equal("1x2", result[1][0])
    end
    def test_generate_eight_players_match
        result = @tournment_generator.generate_for(8)

        assert_equal(3, result.size) 
        assert_equal("1x8", result[0][0])
        assert_equal("2x7", result[0][1])
        assert_equal("3x6", result[0][2])
        assert_equal("4x5", result[0][3])
        assert_equal("1x4", result[1][0])
        assert_equal("2x3", result[1][1])
        assert_equal("1x2", result[2][0])
    end

    def test_number_of_games_for_two_players
        number_of_games = @tournment_generator.number_of_games_for(2)
        assert_equal(1, number_of_games)
    end

    def test_number_of_games_for_four_players
        number_of_games = @tournment_generator.number_of_games_for(4)
        assert_equal(2, number_of_games)
    end

    def test_number_of_games_for_eight_players
        number_of_games = @tournment_generator.number_of_games_for(8)
        assert_equal(4, number_of_games)
    end

    def test_number_of_games_for_three_players
        number_of_games = @tournment_generator.number_of_games_for(3)
        assert_equal(2, number_of_games)
    end

    def test_number_of_games_for_five_players
        number_of_games = @tournment_generator.number_of_games_for(5)
        assert_equal(4, number_of_games)
    end


    def test_number_of_games_for_seven_players
        number_of_games = @tournment_generator.number_of_games_for(7)
        assert_equal(4, number_of_games)
    end

    def test_number_of_games_for_nine_players
        number_of_games = @tournment_generator.number_of_games_for(9)
        assert_equal(8, number_of_games)
    end

    def test_number_of_games_for_fifteen_players
        number_of_games = @tournment_generator.number_of_games_for(15)
        assert_equal(8, number_of_games)
    end

end