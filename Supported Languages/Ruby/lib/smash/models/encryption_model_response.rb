# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # EncryptionModelResponse Model.
  class EncryptionModelResponse < BaseModel
    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :data

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :file

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :success

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :public

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :private

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['data'] = 'data'
        @_hash['file'] = 'file'
        @_hash['success'] = 'success'
        @_hash['public'] = 'public'
        @_hash['private'] = 'private'
      end
      @_hash
    end

    def initialize(data = nil,
                   file = nil,
                   success = nil,
                   public = nil,
                   private = nil,
                   additional_properties = {})
      @data = data
      @file = file
      @success = success
      @public = public
      @private = private

      # Add additional model properties to the instance.
      additional_properties.each do |_name, value|
        instance_variable_set("@#{_name}", value)
      end
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      data = hash['data']
      file = hash['file']
      success = hash['success']
      public = hash['public']
      private = hash['private']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      EncryptionModelResponse.new(data,
                                  file,
                                  success,
                                  public,
                                  private,
                                  hash)
    end
  end
end
