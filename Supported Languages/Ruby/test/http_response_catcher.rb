# This file was automatically generated for SMASH by SMASH v2.0 ( https://smashlabs.io ).

class HttpResponseCatcher < Smash::HttpCallBack
  attr_accessor :response

  def on_before_request(request)
  end

  # Catching the response
  def on_after_response(context)
    @response = context.response
  end
end



