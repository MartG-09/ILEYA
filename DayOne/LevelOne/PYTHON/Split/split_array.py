def split(array):
    newArray = [[] , []] 

    for count in array:
        if (count % 2 == 0) :
            newArray[0].append(count)

        else:
            newArray[1].append(count)           

    return newArray

