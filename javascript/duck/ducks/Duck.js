
export class Duck {
    constructor(name) { this.name = name }

    quack() {}

    fly() {}

    swim() { console.log(this.name + ' is swimming') }

    display() { console.log('I am a ' + this.name) }
}