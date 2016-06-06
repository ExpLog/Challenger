function first_n_digits(filename, n::Int)
    file = open(filename)
    numbers = [parse(BigInt, str) for str in split(readall(file))]
    x = BigInt(0)
    for i in numbers
        x += i
    end
    close(file)
    string(x)[1:n]
end

print(first_n_digits("p13.txt", 10))
