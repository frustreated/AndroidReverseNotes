package com.tencent.qqmusic.mediaplayer.codec.wav;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition;

public class WavRecognition implements IAudioRecognition {
    public AudioType getAudioType(String str, byte[] bArr) {
        AppMethodBeat.m2504i(128533);
        AudioType audioType;
        if (WaveReader.isWavFormat(str)) {
            audioType = AudioType.WAV;
            AppMethodBeat.m2505o(128533);
            return audioType;
        }
        audioType = AudioType.UNSUPPORT;
        AppMethodBeat.m2505o(128533);
        return audioType;
    }

    public AudioType guessAudioType(String str) {
        AppMethodBeat.m2504i(128534);
        AudioType audioType;
        if (TextUtils.isEmpty(str) || !str.toLowerCase().contains(".wav")) {
            audioType = AudioType.UNSUPPORT;
            AppMethodBeat.m2505o(128534);
            return audioType;
        }
        audioType = AudioType.WAV;
        AppMethodBeat.m2505o(128534);
        return audioType;
    }
}
