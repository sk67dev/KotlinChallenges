fun main() {
}
//Constructor function
class NameChange(_oldName: String, _newName: String) {
    //Properties
    val oldName: String
    val newName: String

    //Initializer block
    init {
        this.oldName = _oldName
        this.newName = _newName

        //Print both the old and the new name.
        println("Old name was $_oldName \nNew name is $_newName.")
    }
}
//Object instance
val person = NameChange("Sally Meadows", "Sally Winterbottom")

