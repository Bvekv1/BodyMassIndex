package bibek;

public class CalculateBMI {
    private float Weight, Height;
    public CalculateBMI(float Weight, float Height){
        this.Weight = Weight;
        this.Height = Height;
    }

    public float getWeight() {
        return Weight;
    }

    public void setWeight(float weight) {
        Weight = weight;
    }

    public float getHeight() {
        return Height;
    }

    public void setHeight(float height) {
        Height = height;
    }
    public float BMI(){
        return  (Weight/(Height*Height));
    }
}
