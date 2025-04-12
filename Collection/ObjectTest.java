package Collection;

public class ObjectTest {

    public enum AudioType{
        WAV,
        MP3,
        TIFF
    }

    private String audioFile;
    private AudioType currentAudioType;
    public ObjectTest(String audioFile, AudioType a)
    {
        this.audioFile = audioFile;
        this.currentAudioType = a;
    }

    protected AudioType retrieveAudioType()
    {
        AudioType at = this.currentAudioType;
        System.out.println("Retrieving audio type for "+this.audioFile);
        switch(at)
        {
            case WAV -> {
            return AudioType.WAV;
        }
            case MP3 -> {
            return AudioType.MP3;

        }
            case TIFF -> {
                return AudioType.TIFF;
            }
        }
        return at;
    }
}
