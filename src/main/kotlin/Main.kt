fun main() {
   var product=Products("Yogut",50,2)
    var product1=Products("Maize",50,2)
    var product2=Products("Milk",50,2)
    product.calculateTotal()
    product1.calculateTotal()
    product2.calculateTotal()
    
}
//# 3 Wildlife preservation .input diet,typical lifespan (method migration patterns)
// # output different animals with their distict characteristics and behaviours
// # procee create class species with chatacteristic and behaviour  class Preditor and prey inherit

open class Species(var diet:String,var lifespan:String){
    open val migrate=""
    fun migrationPatterns(){
       println(" This ${this::class.simpleName} eats ${diet} and has a lifespan of ${lifespan} and migrates")
    }

}
class Prey(diet:String,lifespan: String):Species(diet,lifespan){
    override val migrate="Migrates according to seasons"

}
class Preditor(diet:String,lifespan: String):Species(diet,lifespan){
    override val migrate="Migrates according to movement of prey"

}


//class Species{
//    constructor(diet,lifespan){
//        this.diet=diet
//        this.lifespan=lifespan
//    }
//    migrationPatterns(){
//        ` This ${this.constructor.name} eats ${this.diet}and has a life span of ${this.lifespan} and ${this.migrate}`
//    }
//
//}
//class Preditor extends Species{
//    migrate="Migrates according to the movement of the prey"
//}
//class Prey extends Species{
//    migrate="Migrates according to season"
//
//}
//
//let prey1= new Prey("grass","20 years")
//prey1.migrationPatterns()










//# input:name,price,quantity
//# output total value of the products
//# create a class products instanciate objects calculate total use.reduce(a,b -> a+b)
 class Products(var name:String,var price:Int,var quantity:Int){
     fun calculateTotal():Int{
         var total=price*quantity
         return total
     }
 }