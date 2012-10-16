def compute(number):
    i = 0
    while (i < number):
        if (i % 123 == 0):
            i = i+10
        else:
            i = i + 1
    print("result is " + str(i))

if __name__ == '__main__':
    compute(1000000000)
    pass
