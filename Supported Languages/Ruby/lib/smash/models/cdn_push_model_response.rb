# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # CDNPushModelResponse Model.
  class CDNPushModelResponse < BaseModel
    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :success

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :upload

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :cname

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['success'] = 'success'
        @_hash['upload'] = 'upload'
        @_hash['cname'] = 'cname'
      end
      @_hash
    end

    def initialize(success = nil,
                   upload = nil,
                   cname = nil,
                   additional_properties = {})
      @success = success
      @upload = upload
      @cname = cname

      # Add additional model properties to the instance.
      additional_properties.each do |_name, value|
        instance_variable_set("@#{_name}", value)
      end
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      success = hash['success']
      upload = hash['upload']
      cname = hash['cname']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      CDNPushModelResponse.new(success,
                               upload,
                               cname,
                               hash)
    end
  end
end
