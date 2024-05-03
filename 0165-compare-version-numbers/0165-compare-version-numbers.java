class Solution {
    List<Integer> getAllVersion(String ver){
        List<Integer> v=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        sb.append('0');
        for(int i=0;i<ver.length();i++){
            char c=ver.charAt(i);
            if(c=='.'){
                v.add( Integer.parseInt( sb.toString() ) );
                sb.setLength(0);
                sb.append('0');
            }else{
                sb.append(c);
            }
        }
        if(sb.length()!=0)
            v.add( Integer.parseInt(sb.toString() ) );

        return v;
    }
    public int compareVersion(String version1, String version2) {
        List<Integer> v1;
        List<Integer> v2;

        v1 = getAllVersion(version1);
        v2 = getAllVersion(version2);

        for(int i=v1.size()-1; i>=0;i--){
            if(v1.get(i)==0)
                v1.remove(i);
            else
                break;
        }
        for(int i=v2.size()-1;i>=0;i--){
            if(v2.get(i)==0)
                v2.remove(i);
            else
                break;
        }

        for(int i=0;i<Math.min( v1.size(),v2.size()); i++){
            if(v1.get(i) > v2.get(i) )
                return 1;
            if( v1.get(i) < v2.get(i) )
                return -1;
        }
        if(v1.size() > v2.size() ) 
            return 1;
        if(v1.size() < v2.size() )
            return -1;
        return 0;
    }
}