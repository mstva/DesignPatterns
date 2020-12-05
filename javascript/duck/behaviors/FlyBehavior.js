
export function flyBehavior({ name }) {
    return {
        flyWithWings: () => console.log(name + " is flying"),
        flyNoWay: () => console.log(name + " is not flying"),
    }
}