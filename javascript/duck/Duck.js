
export class Duck {
    constructor(name) { this.name = name }

    quack() {
        console.log(this.name + ' is quacking')
    }

    swim() {
        console.log(this.name + ' is swimming')
    }

    display() {
        console.log('I am a ' + this.name)
    }
}