public class Zadanie3 {
	public static void main(String[] args){
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];

		for(int i = 0; i < arr1.length; i++)
			arr1[i] = (int)(Math.random()*125);

		for(int i = 0; i < arr2.length; i++)
			arr2[i] = (int)(Math.random()*125);

		for(int i:arr1)
			System.out.print(i + " ");

		System.out.println();

		for(int i:arr2)
			System.out.print(i + " ");

		int[] addedArray = new int[arr1.length + arr2.length];

		System.arraycopy(arr1, 0, addedArray, 0, arr1.length);
		System.arraycopy(arr2, 0, addedArray, arr1.length, arr2.length);

		System.out.println();
		for(int i:addedArray)
			System.out.print(i + " ");


		System.out.println();
		System.out.println("\n============\n");
		// =============================================================


		int[] theSameElements;

		int howManyEquals = 0;

		for(int i:arr1)
			for(int j:arr2)
				if(i == j)
					howManyEquals++;

		theSameElements = new int[howManyEquals];
		int k = 0;

		for(int i:arr1)
			for(int j:arr2)
				if(i == j){
					theSameElements[k] = i;
					k++;
				}
		for(int i:theSameElements)
			System.out.print(i + " ");


		System.out.println();
		System.out.println("\n============\n");
		// =============================================================


		int[] newIntArray;
		k = 0;
		int howManyFromSection = 0;
		int minValue = addedArray[0], maxValue = addedArray[0];

		for(int i:addedArray)
			if(minValue > i)
				minValue = i;

		for(int i:addedArray)
		    if(maxValue < i)
		        maxValue = i;

		for(int i = minValue + 1; i < maxValue - 1; i++){
		    for(int j = 0; j < addedArray.length; j++){
		        if(addedArray[j] == i)
		            break;
		        else if(addedArray[j] != i && (j == addedArray.length - 1))
		            howManyFromSection++;
            }
        }

        newIntArray = new int[howManyFromSection];

        for(int i = minValue + 1; i < maxValue; i++){
            for(int j = 0; j < addedArray.length; j++){
                if(addedArray[j] == i)
                    break;
                else if(addedArray[j] != i && (j == addedArray.length - 1)) {
                    newIntArray[k] = i;
                    k++;
                }
            }
        }

        for(int i:newIntArray)
            System.out.print(i + " ");
	}
}
