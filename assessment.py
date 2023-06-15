
# 3 Wildlife preservation .input diet,typical lifespan (method migration patterns)
# output different animals with their distict characteristics and behaviours
# procee create class species with chatacteristic and behaviour  class Preditor and prey inherit
from typing import Any


class Species:
    def __init__(self,diet,lifespan): 
          self.diet=diet
          self.lifespan=lifespan
        
    def migrationPatterns(self):
       print (f"This{self.__class__.__name__} eats {self.diet} and has a life span of{self.lifespan} and {self.migrate}")

class Preditor(Species):
 migrate="Migrates according to the pattern of the prey"

class Prey(Species):
 migrate="Migrates according to season"

prey1=Prey("grass","20 years")
prey1.migrationPatterns()



# input:name,price,quantity
# output total value of the products
# create a class products instanciate objects calculate total use.reduce(a,b -> a+b)
class Product:
    def __init__(self,name,price,quantity):
        self.name=name
        self.price=price
        self.quantity=quantity

    def calculate_total(self):
        value=self.price*self.quantity
        return value


product1=Product("Yorgut",50,2)
product1=Product("Milk",50,2)
product1=Product("Pasta",50,2)
product1.calculate_total()

# Library Catalogue Input dictionary of books  by name and author
# output book details
# Process create class library put an emptylist
# methods for adding a book,search ,track,displybook details

class Library:
   def __init__(self):
      
      self.books={}
      

   def add_book(self):
      book=input("Enter bookname:")
      author=input(":Enter author:")
      self.books[book]=author
   
   def details(self):
      if self.books:
         for book,author in self.books.items():
            print(f"Book:{book}  Author:{author}")
         else:("No book in the library")

library=Library()
library.add_book()
library.details()
