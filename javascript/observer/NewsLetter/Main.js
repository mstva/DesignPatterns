import {Newsletter} from "./subject/Newsletter.js";
import {Subscriber} from "./observer/Subscriber.js";


const newsletter = new Newsletter()

const subscriber = new Subscriber(newsletter)

newsletter.setName("Mustafa")