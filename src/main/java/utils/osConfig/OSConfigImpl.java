package utils.osConfig;

public class OSConfigImpl implements OSConfig {
    @Override
    public void provideInfo() {
        System.out.println("Operating System -- " + System.getProperty("os.name"));
        System.out.println("Architecture -- " + System.getProperty("os.arch"));
    }
}
