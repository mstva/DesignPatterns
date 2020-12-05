

export function quackBehavior({ name }) {
    return {
        quack: () => console.log(name + " is quacking"),
        squeak: () => console.log(name + " is squeaking"),
        muteQuack: () => console.log(name + " is not quacking"),
    }
}
