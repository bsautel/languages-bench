def compute(max)
  i = 0
  while i < max
    if i.modulo(123) == 0
      i = i + 10
    else
      i = i + 1
    end
  end

  puts "result is #{i}"
end

compute(1000000000)

