class ProductOfNumbers {
    public int last;
    public ArrayList<Integer> l;
    public ProductOfNumbers() {
        l=new ArrayList<>();
        last=-1;
    }
    
    public void add(int num) {
        
        if(num==0) last=l.size();
        if(l.size()>0 && l.get(l.size()-1)==0){
            l.add(num);
        }
        else if(l.size()>0){
            l.add(l.get(l.size()-1)*num);
        }else{
            l.add(num);
        }
    }
    
    public int getProduct(int k) {
        int idx=l.size()-k;
        if(idx<0) idx=0;
        if(last>=idx){
            return 0;
        }else{
            if(idx>0 && l.get(idx-1)!=0){
                return l.get(l.size()-1)/l.get(idx-1);
            }else{
                return l.get(l.size()-1);
            }
        }
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */