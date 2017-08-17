/*
 * Copyright (C) 2015 MarkMjw
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.markmjw.platform.login.qq;

import cn.markmjw.platform.login.BaseLoginHandler;

/**
 * QQ login handler.
 *
 * @author markmjw
 * @since 1.0.0
 */
public class QQLoginHandler extends BaseLoginHandler {
//    private QQHelper mManager;
//    private Context mContext;
//
//    public QQLoginHandler(Context context) {
//        mContext = context.getApplicationContext();
//        mManager = QQHelper.getInstance(context);
//    }
//
//    /**
//     * login
//     *
//     * @param activity activity
//     * @param listener callback listener
//     */
//    public void login(Activity activity, ILoginListener listener) {
//        setCallBack(listener);
//        mManager.getTencent().login(activity, "all", mAuthListener);
//    }
//
//    /**
//     * logout
//     *
//     * @param activity activity
//     */
//    public void logout(Activity activity) {
//        mManager.getTencent().logout(activity);
//    }
//
//    /**
//     * should be called in {@link Activity#onActivityResult(int, int, Intent)}
//     *
//     * @param requestCode The integer request code originally supplied to
//     *                    startActivityForResult(), allowing you to identify who this
//     *                    result came from.
//     * @param resultCode  The integer result code returned by the child activity
//     *                    through its setResult().
//     * @param data        An Intent, which can return result data to the caller
//     *                    (various data can be attached to Intent "extras").
//     */
//    public void onActivityResult(int requestCode, int resultCode, Intent data) {
//        mManager.getTencent().onActivityResult(requestCode, resultCode, data);
//    }
//
//    private IUiListener mAuthListener = new IUiListener() {
//        @Override
//        public void onComplete(Object response) {
//            if (null == response) {
//                callBack(ILoginListener.CODE_AUTH_FAILED, "");
//                // release resource
//                mManager.getTencent().releaseResource();
//                return;
//            }
//
//            QQLoginResult result = GsonUtil.fromJson(response + "", QQLoginResult.class);
//            AuthResult auth = new AuthResult();
//            auth.from = AuthResult.TYPE_QQ;
//            auth.id = result.openid;
//            auth.accessToken = result.access_token;
//            auth.expiresIn = result.expires_in;
//
//            mManager.getTencent().setAccessToken(auth.accessToken, auth.expiresIn + "");
//            mManager.getTencent().setOpenId(auth.id);
//            long expiresIn = mManager.getTencent().getExpiresIn();
//            log("QQ authorize success!" +
//                    "\nOpenId: " + auth.id +
//                    "\nAccess token: " + auth.accessToken +
//                    "\nExpires in: " + formatDate(expiresIn));
//
//            callBack(ILoginListener.CODE_AUTH_SUCCESS, auth);
//            if (mRequestInfoEnable) {
//                callBack(ILoginListener.CODE_LOGIN_ING, "");
//                // request user info
//                new UserInfo(mContext, mManager.getTencent().getQQToken())
//                        .getUserInfo(mGetInfoListener);
//            }
//        }
//
//        @Override
//        public void onError(UiError e) {
//            callBack(ILoginListener.CODE_AUTH_EXCEPTION, e.errorMessage);
//            // release resource
//            mManager.getTencent().releaseResource();
//        }
//
//        @Override
//        public void onCancel() {
//            callBack(ILoginListener.CODE_CANCEL_AUTH, null);
//            // release resource
//            mManager.getTencent().releaseResource();
//        }
//    };
//
//    private IUiListener mGetInfoListener = new IUiListener() {
//        @Override
//        public void onComplete(Object response) {
//            if (null == response) {
//                callBack(ILoginListener.CODE_AUTH_FAILED, "");
//                // release resource
//                mManager.getTencent().releaseResource();
//                return;
//            }
//
//            // request user info success
//            QQUserInfo info = GsonUtil.fromJson(response + "", QQUserInfo.class);
//            callBack(ILoginListener.CODE_SUCCESS, info);
//
//            // release resource
//            mManager.getTencent().releaseResource();
//        }
//
//        @Override
//        public void onError(UiError e) {
//            callBack(ILoginListener.CODE_FAILED, e.errorMessage);
//            // release resource
//            mManager.getTencent().releaseResource();
//        }
//
//        @Override
//        public void onCancel() {
//            callBack(ILoginListener.CODE_CANCEL_AUTH, null);
//            // release resource
//            mManager.getTencent().releaseResource();
//        }
//    };
}
