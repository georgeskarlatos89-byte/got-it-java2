package androidx.camera.video;

import androidx.camera.video.StreamInfo;

final class AutoValue_StreamInfo extends StreamInfo {
    private final int id;
    private final StreamInfo.StreamState streamState;

    AutoValue_StreamInfo(int i, StreamInfo.StreamState streamState2) {
        this.id = i;
        if (streamState2 != null) {
            this.streamState = streamState2;
            return;
        }
        throw new NullPointerException("Null streamState");
    }

    public int getId() {
        return this.id;
    }

    public StreamInfo.StreamState getStreamState() {
        return this.streamState;
    }

    public String toString() {
        return "StreamInfo{id=" + this.id + ", streamState=" + this.streamState + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StreamInfo)) {
            return false;
        }
        StreamInfo streamInfo = (StreamInfo) obj;
        if (this.id != streamInfo.getId() || !this.streamState.equals(streamInfo.getStreamState())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.id ^ 1000003) * 1000003) ^ this.streamState.hashCode();
    }
}
