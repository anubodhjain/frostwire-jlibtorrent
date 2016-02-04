/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class byte_vector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected byte_vector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(byte_vector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_byte_vector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public byte_vector() {
    this(libtorrent_jni.new_byte_vector(), true);
  }

  public long size() {
    return libtorrent_jni.byte_vector_size(swigCPtr, this);
  }

  public long capacity() {
    return libtorrent_jni.byte_vector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    libtorrent_jni.byte_vector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return libtorrent_jni.byte_vector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    libtorrent_jni.byte_vector_clear(swigCPtr, this);
  }

  public void add(byte x) {
    libtorrent_jni.byte_vector_add(swigCPtr, this, x);
  }

  public byte get(int i) {
    return libtorrent_jni.byte_vector_get(swigCPtr, this, i);
  }

  public void set(int i, byte val) {
    libtorrent_jni.byte_vector_set(swigCPtr, this, i, val);
  }

}
