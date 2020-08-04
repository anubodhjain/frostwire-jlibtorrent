/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class session extends session_handle {
  private transient long swigCPtr;

  protected session(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.session_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(session obj) {
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
        libtorrent_jni.delete_session(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public session(session_params params) {
    this(libtorrent_jni.new_session__SWIG_0(session_params.getCPtr(params), params), true);
  }

  public session() {
    this(libtorrent_jni.new_session__SWIG_1(), true);
  }

  public session(settings_pack pack, session_flags_t flags) {
    this(libtorrent_jni.new_session__SWIG_2(settings_pack.getCPtr(pack), pack, session_flags_t.getCPtr(flags), flags), true);
  }

  public session(settings_pack pack) {
    this(libtorrent_jni.new_session__SWIG_3(settings_pack.getCPtr(pack), pack), true);
  }

  public session(session arg0) {
    this(libtorrent_jni.new_session__SWIG_4(session.getCPtr(arg0), arg0), true);
  }

  public session_proxy abort() {
    return new session_proxy(libtorrent_jni.session_abort(swigCPtr, this), true);
  }

}
