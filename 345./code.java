import java.util.Vector;
class Solution {
    public String reverseVowels(String s) {
        if(s.length()==1||s.length()==0)
            return s;
        Vector<Integer> v=new Vector();//��¼Ԫ��λ��
        char[] a=s.toCharArray();
        //ɨ���ַ���
        for(int i=0;i<s.length();i++){
            //����Ԫ����ĸ
            if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'){
                v.add(i);//��¼�±�
            }
        }
        if(!v.isEmpty()){
            //˫ָ��
            int p=0;//ָ���һ��Ԫ��λ��
            int q=v.size()-1;//ָ�����һ��Ԫ��λ��
            while(p<=q){
                change(a,v.get(p),v.get(q));
                p++;
                q--;
            }
        }
        return String.valueOf(a);
    }
    //����
    public static void change(char[] a,int i,int j){
        char temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}