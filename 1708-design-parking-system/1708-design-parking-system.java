class ParkingSystem {
    int[] arr=new int[3];

    public ParkingSystem(int big, int medium, int small) {
        this.arr[2]=big;
        this.arr[1]=medium;
        this.arr[0]=small;
    }
    
    public boolean addCar(int carType) {
        if(carType==1){
            if(this.arr[2]!=0){
                this.arr[2]--;
                return true;
            }else return false;
        }else if(carType==2){
             if(this.arr[1]!=0){
                this.arr[1]--;
                return true;
            }else return false;
        }else{
             if(this.arr[0]!=0){
                this.arr[0]--;
                return true;
            }else return false;
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */