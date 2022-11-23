public class MediaSizeVisitor extends Visitor {

    private MediaPlayer mediaPlayer;
    private float dimensiuneVideo;
    private float dimensiuneGif;
    private float dimensiunePlaylist;
    private float dimensiuneSong;
    public MediaSizeVisitor() {
    }

    public float visit(Video video){
        dimensiuneVideo += video.getDimensiune();
        return video.getDimensiune();
    }
    public float visit(Gif gif){
        dimensiuneGif += gif.getDimensiune();
        return gif.getDimensiune();
    }
    public float visit(Song song){
        dimensiuneSong += song.getDimensiune();
        return song.getDimensiune();
    }
    public float visit(Playlist playlist){
        return playlist.getDimensiune();
    }
    @Override
    public float visit(MediaPlayer mediaPlayer1) {
        mediaPlayer = mediaPlayer1;
    return mediaPlayer.playList.getDimensiune();
    }

    @Override
    public void printSizes() {
        System.out.println("total"+visit(mediaPlayer));
        System.out.println("Video "+dimensiuneVideo);
        System.out.println("Gif "+dimensiuneGif);
        System.out.println("Song "+dimensiuneSong);
        System.out.println("Playlist "+ dimensiunePlaylist);
    }