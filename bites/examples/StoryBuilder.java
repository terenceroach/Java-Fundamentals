package bites.examples;

public class StoryBuilder {

    public String plot;

    public String addPlotline(String newPlot){
        this.plot = this.plot + " " + newPlot;
        return this.plot;
    }

    public String getPlot(){
        return this.plot;
    }

    public StoryBuilder(String plot){
        this.plot = plot;
    }

    public static void main(String[] args) {
        StoryBuilder storyBuilder = new StoryBuilder("This is the initial plot of the story.");
        String secondPlot = "And this is the second plot!";
        storyBuilder.addPlotline(secondPlot);
        String completedPlot = storyBuilder.getPlot();
        System.out.println(completedPlot);
    }
}
