package src;

public class Aufgabe1 {

public String find_square(int[][] matrix,int width,int height){
	int size=0;
	int pos_x=0;
	int pos_y=0;
	for(int i=0;i<width;i++){
		if(matrix[0][i]==1){
			size=1;
			pos_x=i;
		}
	}
	for(int i=1;i<height;i++){
		for(int j=1;j<width;j++){
			if(matrix[i][j]==1){
				matrix[i][j]=(Math.min(Math.min(matrix[i][j-1],matrix[i-1][j-1]),matrix[i-1][j]))+1;	
			}
			if(matrix[i][j]>size){
				size=matrix[i][j];
				pos_y=i;
				pos_x=j;
			}
		}
	}
	return "("+size+",("+pos_x+","+pos_y+"))";
}
}