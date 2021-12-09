const screen = document.getElementById("screen")

function addNumber(i) {
    screen.innerHTML += i + ''
}

function addOp(i) {
    screen.innerHTML += i
}

function erase() {
    screen.innerHTML = ''
}

function del() {
    screen.innerHTML = screen.innerHTML.slice(0, -1)
}

function compute() {
    screen.innerHTML = eval(screen.innerHTML);
}