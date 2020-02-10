declare -a arr=(BinarySearch
								BinaryTree 
								BubbleSort 
								Factorial 
								LinearSearch 
								QuickSort 
								shortExample 
								shortExample2 
								shortExample3 
								TreeVisitor
                )							
for x in ${arr[@]}
do
	printf "running ${x}\n"
	gcc ${x}.s -o ${x}.exe
	./${x}.exe > ${x}.output
	diff ${x}.output ${x}.correct
	printf "\n"
done