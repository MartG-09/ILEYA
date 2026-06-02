array = [[] , []]
num = 0
quiz = 0

def student_enroll():
    num = int(input("Number of student enrolled :  "))

def quiz_taken():
    quiz = int(input("Number of quiz taken :  "))
  

def collect_scores():
      for count in range(num):
        for num in range(quiz):
            number = int(input("Enter scores :  "))
            array[count].append(number)


student_enroll()
quiz_taken()
collect_scores()
print(array)
