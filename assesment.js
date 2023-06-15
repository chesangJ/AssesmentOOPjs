// # 3 Wildlife preservation .input diet,typical lifespan (method migration patterns)
// # output different animals with their distict characteristics and behaviours
// # procee create class species with chatacteristic and behaviour  class Preditor and prey inherit
class Species{
 constructor(diet,lifespan){
    this.diet=diet
    this.lifespan=lifespan
 }
 migrationPatterns(){
    ` This ${this.constructor.name} eats ${this.diet}and has a life span of ${this.lifespan} and ${this.migrate}`
 }

}
 class Preditor extends Species{
    migrate="Migrates according to the movement of the prey"
 }
 class Prey extends Species{
    migrate="Migrates according to season"

 }

 let prey1= new Prey("grass","20 years")
   prey1.migrationPatterns()




// # input:name,price,quantity

// # output total value of the products
// # create a class products instanciate objects calculate total use.reduce(a,b -> a+b)

class Products{
    constructor(name,price,quantity){
        this.name=name
        this.price=price
        this.quantity=quantity
    }
    claculateValue(){
        let totalvalue=this.price*this.quantity
        return totalvalue
    }
}

let product1=new Products("Yogurt",50,2)
let product2=new Products("Maize",50,2)
let product3=new Products("carot",50,2)


// Library input book ,author
// output list of books with details
//  1st Create a  class book to hold the book then create a class library catalouge to  add books ,track availabe copies and display the book details
 class Book{
   constructor(book,author){
      this.book=book
      this.author=author
   }

 }  

 let book1=new Book("Habits","James")
 let book2=new Book("Habits","James")
 let book3=new Book("Habits","James")
 let books=[]
 books.push(book1,book2,book3)
 
 