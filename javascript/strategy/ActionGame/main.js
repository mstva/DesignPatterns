import {King} from "./client/King.js";
import {Knife} from "./behavior/WeaponBehavior.js";
import {Queen} from "./client/Queen.js";
import {Knight} from "./client/Knight.js";
import {Troll} from "./client/Troll.js";


const king = new King()
king.fight()
king.setWeapon(new Knife("New King"))
king.fight()

const queen = new Queen()
queen.fight()

const knight = new Knight()
knight.fight()

const troll = new Troll()
troll.fight()