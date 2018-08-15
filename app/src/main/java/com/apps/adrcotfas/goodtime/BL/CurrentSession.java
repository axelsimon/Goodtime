package com.apps.adrcotfas.goodtime.BL;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

/**
 * Stores the session remaining duration, type and timer state.
 * @see GoodtimeApplication
 */
public class CurrentSession {
    private MutableLiveData<Long> mDuration = new MutableLiveData<>();
    private MutableLiveData<TimerState> mTimerState = new MutableLiveData<>();
    private MutableLiveData<SessionType> mSessionType = new MutableLiveData<>();
    private MutableLiveData<String> mLabel = new MutableLiveData<>();

    public CurrentSession(long duration) {
        this.mDuration.setValue(duration);
        this.mTimerState.setValue(TimerState.INACTIVE);
        this.mSessionType.setValue(SessionType.WORK);
        this.mLabel.setValue("");
    }

    public LiveData<Long> getDuration() {
        return mDuration;
    }

    public LiveData<TimerState> getTimerState() {
        return mTimerState;
    }

    public LiveData<SessionType> getSessionType() {
        return mSessionType;
    }

    public LiveData<String> getLabel() {
        return mLabel;
    }

    public void setDuration(long newDuration) {
        mDuration.setValue(newDuration);
    }

    public void setTimerState(TimerState state) {
        mTimerState.setValue(state);
    }

    public void setSessionType(SessionType type) {
        mSessionType.setValue(type);
    }

    public void setLabel(String label) {
        mLabel.setValue(label);
    }
}
