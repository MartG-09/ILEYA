import random
books = ["THE HOBBIT" , "THE MYSTERY" , "ANIMAL FARM" , "BRAVE KINGDOM" , "TO KILL A MOCKING BIRD" , "MOBY DICK" , "THE LORD OF THE RINGS"]

def show_books():
    while True:
        for count in range(len(books)):
            print(count + 1 , "  " , books[count])
        
        option = input("Would like to exit (Yes / No) :  ")
        if (option.lower() == "yes"):
            break


def suggest_book():
    while True:
        book = random.choice(books)
        page = random.randint(1 , 100)
    
        print("\nRead '" + book +"'")
        print("Page" , page)

        option = input("Would like me suggest another book  (Yes / No) :  ")
        
        if (option.lower() == "no"):
            break
        elif (option.lower() != "yes"):
            while True:
                option = input("Would like me suggest another book  (Yes / No) :  ")
                if (option.lower() == "yes" or option.lower() == "no"):
                    break


def add_book():
    while True:
        show_books()
        choice = input("Do you want to add a  book (yes / no):  ")
        if (choice.lower() == "yes"):
            title = input("Add a new book :  ")
            for count in range(len(books)):
                if (title.upper() == books[count]):
                    print("Book already exists!!!")
                    break
                else:
                    books.append(title.upper())
                    print("Boook added successfully!!!")
                    break


        else:
            print("Nothing was added!!!")
            break



def remove_book():
    while True:
        show_books()

        select = input("\nDo you want to remove a book (yes / no):  ")
        if (select.lower() == "yes"):
            num = int(input("Enter book number :  "))
            if (num <= len(books) and num > 0):
                books.pop(num - 1)
                print("Book removed successfully!!!")

        else:
            print("Nothing was removed again!!!")
            break


def update_book():
    while True:
        show_books()
        select = input("\nDo you want to update a book (yes / no):  ")
        if (select.lower() == "yes"):
            old = input("Enter book name to be change :  ")
            new = input("Enter new book name :  ")

            index = books.index(old.upper())
            books[index] = new.upper()
        else:
            print("No book was updated again!!")
            break
            
                    





while True:
    print("""
==== APPLICATION SAMPLE ====

Welcome to the Book Suggestion System!!!

    .........................
            M E N U
    .........................

    1. GET SUGGGESTIONS
    2. ADD BOOK
    3. REMOVE BOOK
    4. UPDATE BOOK
    5. SHOW ALL BOOKS
    6. EXIT
""")
    option = int(input("Select options :  "))


    match(option):
        case 1 : suggest_book()
        case 2 : add_book()
        case 3 : remove_book()
        case 4 : update_book()
        case 5 : show_books()
        case 6 : 
            print("BYE you can check in anytime!!!")
            break
        case _: print("\nInvalid option! Please choose between 1 and 6")














