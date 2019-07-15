import fr.hervedarritchon.utils.kesve.ObjectMapperBuilder

/**
 * Created by Hervé Darritchon on 2019-06-26.
 *
 */
fun main() {
    println(ObjectMapperBuilder.from("elt1,elt2").build())
}