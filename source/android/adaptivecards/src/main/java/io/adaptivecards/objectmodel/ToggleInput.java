/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class ToggleInput extends BaseInputElement {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected ToggleInput(long cPtr, boolean cMemoryOwn) {
    super(AdaptiveCardObjectModelJNI.ToggleInput_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ToggleInput obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwnDerived = own;
    super.swigSetCMemOwn(own);
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        AdaptiveCardObjectModelJNI.delete_ToggleInput(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ToggleInput() {
    this(AdaptiveCardObjectModelJNI.new_ToggleInput__SWIG_0(), true);
  }

  public ToggleInput(ToggleInput arg0) {
    this(AdaptiveCardObjectModelJNI.new_ToggleInput__SWIG_1(ToggleInput.getCPtr(arg0), arg0), true);
  }

  public JsonValue SerializeToJsonValue() {
    return new JsonValue(AdaptiveCardObjectModelJNI.ToggleInput_SerializeToJsonValue(swigCPtr, this), true);
  }

  public String GetTitle() {
    return AdaptiveCardObjectModelJNI.ToggleInput_GetTitle(swigCPtr, this);
  }

  public void SetTitle(String value) {
    AdaptiveCardObjectModelJNI.ToggleInput_SetTitle(swigCPtr, this, value);
  }

  public String GetValue() {
    return AdaptiveCardObjectModelJNI.ToggleInput_GetValue(swigCPtr, this);
  }

  public void SetValue(String value) {
    AdaptiveCardObjectModelJNI.ToggleInput_SetValue(swigCPtr, this, value);
  }

  public String GetValueOff() {
    return AdaptiveCardObjectModelJNI.ToggleInput_GetValueOff(swigCPtr, this);
  }

  public void SetValueOff(String value) {
    AdaptiveCardObjectModelJNI.ToggleInput_SetValueOff(swigCPtr, this, value);
  }

  public String GetValueOn() {
    return AdaptiveCardObjectModelJNI.ToggleInput_GetValueOn(swigCPtr, this);
  }

  public void SetValueOn(String value) {
    AdaptiveCardObjectModelJNI.ToggleInput_SetValueOn(swigCPtr, this, value);
  }

  public boolean GetWrap() {
    return AdaptiveCardObjectModelJNI.ToggleInput_GetWrap(swigCPtr, this);
  }

  public void SetWrap(boolean value) {
    AdaptiveCardObjectModelJNI.ToggleInput_SetWrap(swigCPtr, this, value);
  }

  public static ToggleInput dynamic_cast(BaseCardElement baseCardElement) {
    long cPtr = AdaptiveCardObjectModelJNI.ToggleInput_dynamic_cast(BaseCardElement.getCPtr(baseCardElement), baseCardElement);
    return (cPtr == 0) ? null : new ToggleInput(cPtr, true);
  }

}
