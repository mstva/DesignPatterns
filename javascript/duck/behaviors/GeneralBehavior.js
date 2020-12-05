

export function generalBehavior({ name }) {
    return {
        swim: () => console.log(name + " is swimming"),
        display: () => console.log("I am a " + name),
    }
}
