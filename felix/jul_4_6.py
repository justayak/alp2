import math

def parent(i):
	return int(math.ceil((i -1)/2))	
def left(i):
	return 2*i+1
def right(i):
	return (2*i)+2
	
#Die processList wird in eine Heap-Struktur transformiert 
def buildPriorityQueue( processList ):
	return sorted(processList, key=lambda process:process[0])
 
# child = index, parent = index
# stoppt, wenn 0 erreicht wird oder parent <= child
def _bubbleUp(list,child, prnt):
	if child == 0 or list[child] >= list[prnt]:
		m = ">> " + repr(list[child]) + " >= " + repr(list[prnt]) + " ]or : " + repr(child == 0)
		print (m)
		return
	else :
		list[child], list[prnt] = list[prnt], list[child]
		newParent = parent(prnt)
		_bubbleUp(list, prnt, newParent)
		
def insert( priorityQueue, newProcess ): 
	nextSlot = len(priorityQueue)
	priorityQueue.append(newProcess)
	prnt = parent(nextSlot)
	_bubbleUp(priorityQueue,nextSlot,prnt)
	

def isEmpty( priorityQueue ) :
	return not priorityQueue
	
def removeProcess( priorityQueue ):
	if isEmpty(priorityQueue):
		return None
	result,priorityQueue[0] = priorityQueue[0], priorityQueue.pop()
	priorityQueue.sort(key=lambda process:process[0])
	return result

list=[(4,"a"),(3,"b"),(10,"c"),(7,"d"),(8,"e"),(0,"f")]
heap = buildPriorityQueue(list)

v = (-1,"h")
insert(heap, v)

v = (1,"g")
insert(heap, v)

v = (15,"i")
insert(heap, v)

v = (12,"j")
insert(heap, v)

v = (16,"k")
insert(heap, v)

v = (-3,"k")
insert(heap, v)

v = (-2,"k")
insert(heap, v)

print (heap)

v = removeProcess(heap)

v = removeProcess(heap)
v = removeProcess(heap)
v = removeProcess(heap)
v = removeProcess(heap)

print (heap)











