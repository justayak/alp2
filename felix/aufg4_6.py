def left(i):
	return 2*i+1
def right(i):
	return (2*i)+2

def heapify(list,a):
	i = a
  	while(True):
		x = i
    		if left(i) < len(list) and (list[left(i)])[1] <(list[x])[1]:
      			x = left(i)
    		if right(i) < len(list) and (list[right(i)])[1] <(list[x])[1]:
      			x = right(i)
    		if (x == i):
      			break
    		temp=list[x]
		list[x]=list[i]
		list[i]=temp
    		i = x
	return list
		
 
def buildPriorityQueue( processList ):
	list=processList
	for i in range(len(list)/2+1,0,-1):
		list=heapify(list,i)
	print(list)
 #Die processList wird in eine Heap-Struktur transformiert 

def insert( priorityQueue, newProcess ): 
	return None
 #Ein neuer Prozess wird in dem priorityQueue eingefuegt 

def isEmpty( priorityQueue ) :
	return None

 #gibt einen Wahrheitswert als Rueckgabewert, je nachdem, ob die 

 #Prioritaetswarteschlange leer ist oder nicht """
def removeProcess( priorityQueue ):
	return None
 #Der Prozess mit der hoechsten Prioritaet wird aus der priorityQueue

 #entfernt und als Ergebnis der Funktion zurueckgegeben """
list=[("la",4),("hd",3),("jhg",5),("sde",1),("fsdfs",2),("gfsgs",0)]
buildPriorityQueue(list)













