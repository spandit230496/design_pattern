from concrete_class.document import Document

doc1 = Document("Report", "This is the original report") # clone object 


doc2 = doc1.clone() # modify cloned object 
doc2.title = "Report Copy" 

doc1.show() 

print("------") 

doc2.show()