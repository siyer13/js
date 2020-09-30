function add(x, y) {
    return x + y
}

function calc(x, y, func) {
    return func(x,y)
}


a = calc(3,2,add)


console.log(a)

/////////


add = (x, y) => x + y

calculator = (x, y, func) => func(x, y) 

console.log(calculator(5, 5, add))
