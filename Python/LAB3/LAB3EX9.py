def square(x):
    return x * x

def double(x):
    return 2 * x

def decrease(x):
    return x - 1

function_dict = {"a": square, "b": double, "c": decrease }
for key in "abc":
    print(key, function_dict[key](3))