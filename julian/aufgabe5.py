#Quadtree
class QuadTree():
	
	def __init__(self, matrix):
		self.matrix = matrix




def findQ(matrix):
	
	height = len(matrix[0])
	
	
	
	w = 0 #
	
	
	
	for x in range(len(matrix)):
		for y in range(len(matrix[x])):
			
			if matrix[x][y] == 1:
				w = w+1
			else:
				w = 0
				
	
	
	
	return
	
	
	

n = 50
matrix = [[0]*n for x in range(n)]
matrix[10][10] = 1
matrix[10][11] = 1
matrix[10][12] = 1
matrix[10][13] = 1
matrix[11][10] = 1
matrix[11][11] = 1
matrix[11][12] = 1
matrix[11][13] = 1
matrix[12][10] = 1
matrix[12][11] = 1
matrix[12][12] = 1
matrix[12][13] = 1
matrix[13][10] = 1
matrix[13][11] = 1
matrix[13][12] = 1
matrix[13][13] = 1


tree = QuadTree(matrix)

print(tree.matrix)



#findQ(matrix)