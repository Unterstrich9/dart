public class dartrechner {
/*for(int i=0;i<10;i++)*/

public boolean checkout(int score) {
    for(boolean checkout=false;checkout=true;) {
        if (score > 170) {
            return checkout;
        }else{
            return true;
        }
    }
    return false;
}

public static void main(String[] args) {

int[][] tabelscore = {
    {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,25},
    {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,50},
    {3,6,9,12,15,18,21,24,27,30,33,36,39,42,45,48,51,54,57,60}
};

int dart1 = tabelscore[0][0];
int dart2 = tabelscore[2][19];
int dart3 = tabelscore[0][4];
int score = dart1 + dart2 + dart3;


}

}