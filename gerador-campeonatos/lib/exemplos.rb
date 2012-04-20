require 'test/unit'

# Array
nums = [1, 2, 3, 4, 5, 6]
nums.each { |n| puts n * 100}

# Map / Dictionary
ages = { :joao => 38, :decio => 30, :simone => 25, "rafael" => 28 }
puts ages.keys.join(",")

greather_than_25 = ages.select {|k,v| v > 25}
greather_than_25.each {|k,v| puts k}

# Math Package
puts Math.sin(Math::PI)

# Method definition
def my_method param
    puts param.upcase
end

def sum(a,b) 
    return a+b
end

def sum2(a,b) 
    a+b
end

# Method call with or whitout parenthesis
my_method("apontador")
my_method "Rafael"


# Conditional
if  true
    puts "TRUE"
end

puts "ruby rules" if 1 > 0
puts "Ruby Rules" unless 1 < 0

# Ranges
for i in (1..5)
    puts i
end

age = 10
puts 'Minha idade eh #{age}'

h = nil
puts " Pooooatz " if h.nil?

(1..3).each { |i,j| puts "Oi #{i} - #{j}"}
