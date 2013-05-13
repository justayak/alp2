import math

def left(i):
	return 2*i+1
def right(i):
	return (2*i)+2
	
def parent(i):
	return int(math.ceil(i/2)) -1
	
#Die processList wird in eine Heap-Struktur transformiert 
def buildPriorityQueue( processList ):
	return sorted(processList)
 
# child = index, parent = index
# stoppt, wenn 0 erreicht wird oder parent <= child
def _bubbleUp(list,child, prnt):
	if child == 0 or list[child] >= list[prnt]:
		return
	else :
		list[child], list[prnt] = list[prnt], list[child]
		newParent = parent(prnt)
		_bubbleUp(list, prnt, newParent)
	
def _printHeap(heap):
	return 
	
def _height(heap, current = -1):
	if current == -1
		current = len(heap)-1
	
	
def insert( priorityQueue, newProcess ): 
	nextSlot = len(priorityQueue)
	priorityQueue.append(newProcess)
	prnt = parent(nextSlot)
	_bubbleUp(priorityQueue,nextSlot,prnt)
	
	
 #Ein neuer Prozess wird in dem priorityQueue eingefuegt 

def isEmpty( priorityQueue ) :
	return None

 #gibt einen Wahrheitswert als Rueckgabewert, je nachdem, ob die 

 #Prioritaetswarteschlange leer ist oder nicht """
def removeProcess( priorityQueue ):
	return None
 #Der Prozess mit der hoechsten Prioritaet wird aus der priorityQueue

 #entfernt und als Ergebnis der Funktion zurueckgegeben """
list=[(4,"la"),(3,"hd"),(10,"jhg"),(7,"sde"),(8,"fsdfs"),(0,"gfsgs")]
heap = buildPriorityQueue(list)

print (heap)

v = (1,"Felix!")
insert(heap, v)

v = (-12,"Felix!")
insert(heap, v)

v = (99,"Felix!")
insert(heap, v)

print (heap)











