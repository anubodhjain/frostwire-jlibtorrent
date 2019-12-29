/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class remove_flags_t {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected remove_flags_t(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(remove_flags_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_remove_flags_t(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static remove_flags_t all() {
    return new remove_flags_t(libtorrent_jni.remove_flags_t_all(), true);
  }

  public boolean nonZero() {
    return libtorrent_jni.remove_flags_t_nonZero(swigCPtr, this);
  }

  public boolean eq(remove_flags_t f) {
    return libtorrent_jni.remove_flags_t_eq(swigCPtr, this, remove_flags_t.getCPtr(f), f);
  }

  public boolean ne(remove_flags_t f) {
    return libtorrent_jni.remove_flags_t_ne(swigCPtr, this, remove_flags_t.getCPtr(f), f);
  }

  public remove_flags_t or_(remove_flags_t other) {
    return new remove_flags_t(libtorrent_jni.remove_flags_t_or_(swigCPtr, this, remove_flags_t.getCPtr(other), other), true);
  }

  public remove_flags_t and_(remove_flags_t other) {
    return new remove_flags_t(libtorrent_jni.remove_flags_t_and_(swigCPtr, this, remove_flags_t.getCPtr(other), other), true);
  }

  public remove_flags_t xor(remove_flags_t other) {
    return new remove_flags_t(libtorrent_jni.remove_flags_t_xor(swigCPtr, this, remove_flags_t.getCPtr(other), other), true);
  }

  public remove_flags_t inv() {
    return new remove_flags_t(libtorrent_jni.remove_flags_t_inv(swigCPtr, this), true);
  }

  public int to_int() {
    return libtorrent_jni.remove_flags_t_to_int(swigCPtr, this);
  }

  public remove_flags_t() {
    this(libtorrent_jni.new_remove_flags_t(), true);
  }

}
