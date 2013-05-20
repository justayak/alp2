#Aufgabe 5.2
def swap(sqc,i,j):
	sqc[i],sqc[j] = sqc[j],sqc[i]
	
def heapify(sqc,end,i):
	l=2*i+1
	r=2*(i+1)
	max=i
	if l<end and sqc[i]<sqc[l]:
		max=l
	if r<end and sqc[max]<sqc[r]:
		max=r
	if max!=i:
		swap(sqc,i,max)
		heapify(sqc,end,max)
	
def heapSort(sqc):
	end = len(sqc)
	start=end/2-1
	for i in range(start,-1,-1):
		heapify(sqc,end,i)
	for i in range(end-1,0,-1):
		swap(sqc,i,0)
		heapify(sqc,i,0)


liste =["A91ZEE","A91ZEA", "A91ZEB", "A91ZEC","B91ZEE","A11ZEE","C91ZEE"]

print(liste)

heapSort(liste)

print(liste)