class StringExercise{
    char[] getMiddle(String word){
      
			if(word.length()%2==0){
        char[] a= new char[2];
        a[0]=word.charAt(word.length()/2-1);
        a[1]=word.charAt(word.length()/2);
        return a;
      }
      char[] a= new char[1];
       a[0]= word.charAt(word.length()/2); 
    	return a;
    }
    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("tree"));
    }
}